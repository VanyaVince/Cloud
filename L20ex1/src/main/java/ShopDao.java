import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class ShopDao {
    private static final ObjectMapper mapper = new ObjectMapper();//преобразует файлы.

    public List<Good> findAll() {
        try {
            FileInputStream fis = new FileInputStream("goods.json");
            List<Good> goods = mapper.readValue(fis, new TypeReference<List<Good>>() {
            });
            return goods;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Good findByName(String name) {
        List<Good> goods = findAll();
        for (Good good : goods) {
            if (good.nameOfGood.equals(name)) {
                return good;
            }
        }
        return null;
    }

    public void save(Good good) throws IOException {
        List<Good> goods = findAll();
        goods.add(good);
//        if (good == null) {  // разобрать
//            throw new IllegalStateException("Good is null");
//        } else {
//            Good goodInFile = findByName(good.nameOfGood);
//
//            if (goodInFile == null) {
//                goods.add(good);
//            } else {
//                for (Good good1 : goods){
//                    if (good1.nameOfGood.equals(good.nameOfGood)){
//                        good1.count += good.count;
//                        good1.price = good.price;
//                    }
//                }
//
//            }

        String listOfGoods = mapper.writeValueAsString(goods);
        FileOutputStream fos = new FileOutputStream("goods.json");//открытие потока, для чтения файла.
        fos.write(listOfGoods.getBytes());
        fos.flush();
        fos.close();//закрытие потока

    }

    public void deleteByName(String name) throws IOException {
        List<Good> goods = findAll();
            //if (good.nameOfGood.equals(name)) {
                Iterator<Good> it = goods.iterator();
                while (it.hasNext()) {
                    Good el = it.next();
            if (el.nameOfGood.equals(name))
                    it.remove();
                }
        String listOfGoods = mapper.writeValueAsString(goods);
        FileOutputStream fos = new FileOutputStream("goods.json");//открытие потока, для чтения файла.
        fos.write(listOfGoods.getBytes());
        fos.flush();
        fos.close();
            }
        }





//    public Good findByName(String name) {
//        return goods.stream()
//                .filter(it -> Objects.equals(it.getId(), name))
//                .findFirst()
//                .orElse(null);
//    }
//
//    public void save(Good good) {
//        if (good == null) {
//            throw new IllegalArgumentException("Good is null");
//        }
//        Good oldGood = findByName(good.getId());
//        if (oldGood == null) {
//            goods.add(good);
//        } else {
//            Integer newPrice = good.getPrice();
//            Integer newCount = good.getCount() + oldGood.getCount();
//            goods.remove(oldGood);
//            goods.add(new Good(good.getId(), newPrice, newCount));
//        }
//    }
//
//    public void deleteByName(String name) {
//        goods.stream()
//                .filter(it -> Objects.equals(it.getId(), name))
//                .findFirst()
//                .ifPresent(it -> goods.remove(it));
//    }
