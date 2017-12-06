import stone.EStone;
import stone.Stone;
import stone.species.Diamond;
import stone.species.Ruby;
import stone.species.Sapphire;

import java.util.*;

/**
 * Created by root on 06.12.17.
 */
public class Run {

    private List<Stone> list;
    private Scanner scn;

    public Run() {
        list = new ArrayList<Stone>();
        scn = new Scanner(System.in);
        int v;

        while(true) {
            System.out.println("0) переглянути список каменів в намисті");
            System.out.println("1) додати камінь");
            System.out.println("2) вивести ціну намиста");
            System.out.println("3) вивести вагу намиста ( в каратах)");
            System.out.println("4) знайти камінь в намисті");
            System.out.println("5) відсортувати камені по цінності");

            v = scn.nextInt();
            run(v);
        }
    }


    private void run(int k) {
        if(k < 0 || k > 5) {
            System.out.println("виберіть число в діапазоні від 0 до 5");
            return;
        } else {
            switch(k) {
                case 0:
                    Print_List();
                    break;
                case 1:
                    add_stone();
                    break;
                case 2:
                    Print_price();
                    break;
                case 3:
                    Print_mass();
                    break;
                case 4:
                    search_stone();
                    break;
                case 5:
                    sorting();
                    break;
            }
        }
    }

    private void Print_List() {
        for(int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }

    private void add_stone() {
        Stone stone = null;
        int mass;
        int quality;
        String name;
        EStone eStone = null;
        int price;

        System.out.println("Введіть вагу");
        mass = scn.nextInt();
        System.out.println("Введіть прозорість( від 1 до 100)");
        quality = scn.nextInt();
        System.out.println("Введіть назву");
        name = scn.next();
        System.out.println("Введіть ціну");
        price = scn.nextInt();
        System.out.println("Виберіть тип:");
        System.out.println("1)Діамант \n 2)Рубін \n 3)Сапфір ");

        switch (scn.nextInt(4)) {
            case 1: eStone = EStone.Diamond;
                break;
            case 2: eStone = EStone.Ruby;
                break;
            case 3: eStone = EStone.Sapphire;
                break;
        }

        switch (eStone) {
            case Diamond:
                stone = new Diamond(price , mass , quality , name);
                break;
            case Ruby:
                stone = new Ruby(price , mass , quality , name);
                break;
            case Sapphire:
                stone = new Sapphire(price , mass , quality , name);
                break;
        }
        list.add(stone);
    }

    private void Print_price() {
        int pr = 0;
        for (int i = 0; i < list.size(); i++) {
            pr += list.get(i).get_price();
        }
        System.out.println(pr + " $");
    }

    private void Print_mass() {
        int ms = 0;
        for (int i = 0; i < list.size(); i++) {
            ms += list.get(i).get_mass();
        }
        System.out.println(ms + " карат");
    }

    private void search_stone() {
        int ql_min;
        int ql_max;

        System.out.println("Введіть мінімальне значення прозорості");
        ql_min = scn.nextInt();
        System.out.println("Введіть максимальне значення прозорості");
        ql_max = scn.nextInt();

        for (int i = 0; i < list.size(); i ++) {
            if(list.get(i).get_quality() >= ql_min && list.get(i).get_quality() <= ql_max) {
                System.out.println(list.get(i).toString());
            }
        }

    }

    private void sorting() {
        Collections.sort(list , new Comparator<Stone>() {

            @Override
            public int compare(Stone stone1, Stone stone2) {
                return Integer.valueOf(stone1.price).compareTo(stone2.price);
            }
        });
    }
    }



