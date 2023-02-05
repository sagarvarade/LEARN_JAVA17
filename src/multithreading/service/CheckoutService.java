package multithreading.service;

import static multithreading.util.CommonUtil.stopWatch;

import java.util.List;
import java.util.stream.Collectors;

import multithreading.domain.checkout.Cart;
import multithreading.domain.checkout.CartItem;
import multithreading.domain.checkout.CheckoutResponse;
import multithreading.domain.checkout.CheckoutStatus;
public class CheckoutService {

	PriceValidatorService pService;

	public CheckoutService(PriceValidatorService pService) {
		this.pService = pService;
	}

	public CheckoutResponse checkout(Cart cart) {
		stopWatch.start();
		List<CartItem> prcList = cart.getCartItemList().parallelStream().map(cartIterm -> {
			boolean isPriceInvalid = pService.isCartItemInvalid(cartIterm);
			cartIterm.setExpired(isPriceInvalid);
			return cartIterm;
		}).filter(CartItem::isExpired).collect(Collectors.toList());
		if (prcList.size() > 0) {
			return new CheckoutResponse(CheckoutStatus.FAILURE, prcList);
		}
		stopWatch.stop();
		
		System.out.println(stopWatch.getTime());
		return new CheckoutResponse(CheckoutStatus.SUCCESS);
	}
}
