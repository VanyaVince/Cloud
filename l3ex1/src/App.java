import java.util.Scanner;
import java.util.Random;

public class App {


    //  public static Scanner in = new Scanner(System.in);
    public static int Production_max = 1000;
    public static int k1 = 100;
    public static int k2 = 200;
    public static int k3 = 300;
    public static int price1 = 100;
    public static int price2 = 90;
    public static int price3 = 80;

    public static void main(String[] args) {

    //    int earnedMoney = 0;
        int producedGoods = produceGoods();
     //   int goodsCount = producedGoods;

     //   int goodsForFirstShop = getGoodsForShop(1);
     //   goodsCount -= goodsForFirstShop;
    //    int goodsForSecondShop = getGoodsForShop(2);
     //   goodsCount -= goodsForSecondShop;
     //   int goodsForThirdShop = getGoodsForShop(3);
     //   goodsCount -= goodsForThirdShop;


     //   earnedMoney += sellGoods(goodsForFirstShop, 1);
     //   earnedMoney += sellGoods(goodsForSecondShop, 2);
      //  earnedMoney += sellGoods(goodsForThirdShop, 3);


        int soldGoods = producedGoods - goodsCount;
        printReport(soldGoods, earnedMoney);
    }

    public static int produceGoods() {
        Random random = new Random(System.currentTimeMillis());
        int produced = random.nextInt(Production_max + 1);
        System.out.println("The plant produced " + produced + " details");
        return produced;
    }

    public static int getGoodsForShop(int shopNumber) {
        if (shopNumber == 1) {


            return k1;
        }

        if (shopNumber == 2) {

            return k2;
        }

        if (shopNumber == 3) {

            return k3;
        }
        return 0;
    }


    public static int sellGoods(int countToSell, int shopNumber) {
        int earned = 0;
        int price = 0;

        if (shopNumber == 1) {
            price = price1;
            //    earned = countToSell * price1;
            //    System.out.println("Магазин купил " + countToSell + " по цене " + earned + " (цена за штуку: " + price1 +")");
        }

        if (shopNumber == 2) {
            price = price2;
            //    earned = countToSell * price2;
            //    System.out.println("Магазин купил " + countToSell + " по цене " + earned + " (цена за штуку: " + price2 +")");
        }

        if (shopNumber == 3) {
            price = price3;
            //    earned = countToSell * price3;
            //    System.out.println("Магазин купил " + countToSell + " по цене " + earned + " (цена за штуку: " + price3 +")");
        }
        earned = countToSell * price;
        System.out.println("Магазин купил " + countToSell + " по цене " + earned + " (цена за штуку: " + price + ")");
        return earned;
    }

    public static void printReport(int soldGoodsCount, int earnedMoney) {
        double middlePrice = earnedMoney % soldGoodsCount;
        System.out.println("Завод продал " + soldGoodsCount +
                " по цене " + earnedMoney + ", средняя цена за штуку: " + middlePrice);
    }


}






