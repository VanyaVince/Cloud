import java.util.List;

public class ShopService {
    ShopDao dao = new ShopDao();

    public List<Good> getAll() {
        return dao.findAll();
    }

    public void addGoods(List<Good> goods) {
        for (Good good : goods) {
            dao.save(good);
        }
    }

    public void buyGoods(List<Good> goods) {

    }
}
