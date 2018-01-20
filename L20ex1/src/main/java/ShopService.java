import java.io.IOException;
import java.util.List;

public class ShopService {
    ShopDao dao = new ShopDao();

    public List<Good> getAll() {
        return dao.findAll();
    }

    public void addGoods(List<Good> goods) throws IOException {
        for (Good good : goods) {
            dao.save(good);
        }
    }

    public void buyGoods(List<Good> goods) {

    }
}
