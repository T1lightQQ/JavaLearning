import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++)
//        {
//            System.out.println(args[i]);
//
//        }
//        Scanner scannerInput = new Scanner(System.in);
//        System.out.print("Enter ur name: ");
//        String userName = scannerInput.nextLine();
//        System.out.println("Здравствуйте " + userName);
//
//        int sint = 42;
//        Integer oint = 42;
//
//        boolean b1 = false;
//        boolean b2 = true;
//
//        byte a = 3; // (-128 : 127)
//        short sh = 4; // (-32,768 : 32,767)
//
//        int in = 76;
//
//        long l = 152;
//
//        in = 0xFF;
//        in = 0b1111;
//        in = 071;
//
//        float fl = 8.5F;
//        double dbl = 8.5;
//
//        sh = (short) l;
//
//        char ch = 64;
//        ch = 'a';
//        ch = '\n';
//        ch = '\r';
//        ch = '\t';
//        ch = '\u4210';
//        ch = '\'';
//
//        String str = "This is \"String\" \u5836 \n";
//
//        System.out.println("kjhgdfkjghfg\n"
//                + "sdfsdfsdf");
//
//        System.out.println("""
//                sdfsdfsdfs
//                sdfsfsdfsdf
//                sdfsdfsdfsd
//                sdfsdfsdfsdfsd
//                """);
//
//        do {
//
//        } while(sint > 0);
//
//        for (int i = 0; i < sint; i++)
//        {
//
//        }
//
//        int[] arr = new int[4];
//        int arr2[] = new int[] {1, 2, 4, 5, 6, 7};




        // 1
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scannerInput.nextLine();

        System.out.print("Введите время: ");
        int time = scannerInput.nextInt();


        if (time >= 6 & time <= 12) {
            System.out.println("Доброе утро, " + name);
        } else if (time >= 13 & time <= 17) {
            System.out.println("Добрый день, " + name);
        } else if (time >= 18 & time <= 22) {
            System.out.println("Добрый вечер, " + name);
        } else {
            System.out.println("Доброй ночи, " + name);
        }




        // 2
        int arr[] = new int[]{2, 5, -3, 10, 1};
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        int summ = 0;
        for (int i = 0; i < 5; i++) {
            summ += arr[i];
        }
        System.out.println(summ);

        System.out.println((double) summ / 5);

        int maxi = arr[0];
        for (int i = 0; i < 5; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        System.out.println(maxi);



        // 3
        System.out.println("Введите первое вещественное число: ");
        double firstNum = scannerInput.nextDouble();

        System.out.println("Введите второе вещественное число: ");
        double secondNum = scannerInput.nextDouble();

        System.out.println("Введите знак операции: ");
        char operant = scannerInput.next().charAt(0);

        if (operant == '+')
        {
            System.out.println(firstNum + secondNum);
        }
        else if (operant == '-')
        {
            System.out.println(firstNum - secondNum);
        }
        else if (operant == '*')
        {
            System.out.println(firstNum * secondNum);
        }
        else if (operant == '/')
        {
            System.out.println(firstNum / secondNum);
        }
        else
        {
            System.out.println("Ащипка");
        }



        // 4
        boolean process = true;
        do
        {
            System.out.println("Введите число: ");
            int num = scannerInput.nextInt();
            if (num <= 0)
            {
                process = false;
                break;
            }
            while (num > 0)
            {
                System.out.println(num);
                num--;
            }
            System.out.println("Найти все числа кратные трем в этом диапазоне ? Да/Нет");
            String choose = scannerInput.nextLine();

            if (choose == "Да" || choose == "да")
            {
                while (num > 0) {
                    if (num % 3 == 0) {
                        System.out.println(num);
                    }
                    num--;
                }
            }

        } while(process);

    }
}
