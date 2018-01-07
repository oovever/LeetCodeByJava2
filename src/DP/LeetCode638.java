package DP;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OovEver
 * 2018/1/6 15:29
 */
public class LeetCode638 {
    public static int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < special.size(); i++) {
            List<Integer> offer = special.get(i);
//            是否可用当前优惠
            boolean invalidOffer = false;
            for(int j = 0; j < needs.size(); j++) {
                int remain = needs.get(j) - offer.get(j);
                needs.set(j, remain);
                if(!invalidOffer && remain < 0) invalidOffer = true;
            }
            if(!invalidOffer) { //if valid offer, add offer price and recurse remaining needs
                result = Math.min(result, shoppingOffers(price, special, needs) + offer.get(needs.size()));
            }
            for(int j = 0; j < needs.size(); j++) { // reset the needs
                int remain = needs.get(j) + offer.get(j);
                needs.set(j, remain);
            }
        }
        // 选择最小的价格
        int nonOfferPrice = 0;
        for(int i = 0; i < needs.size(); i++) {
            nonOfferPrice += price.get(i) * needs.get(i);
        }
        return Math.min(result, nonOfferPrice);
    }

    public static void main(String[] args) {
        List<Integer> price = new ArrayList<>();
        price.add(2);
        price.add(5);
        List<List<Integer>> special = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(3);
        temp.add(0);
        temp.add(5);
        special.add(temp);
        temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(10);
        special.add(temp);
        List<Integer> needs = new ArrayList<>();
        needs.add(3);
        needs.add(2);
        System.out.println(shoppingOffers(price,special,needs));
    }
}
