import java.util.Scanner;

public class Workmain {
    public static void main(String[] args) {
        Workshow ws = new Workshow();
        Workfind wf = new Workfind();
        Workdel wd = new Workdel();

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("********欢迎使用图书馆系统********");
            System.out.println("          1.查看");
            System.out.println("          2.删除");
            System.out.println("          3.模糊查找");
            System.out.println("*********************************");
            int choose = input.nextInt();
            Integer id;
            switch (choose) {
                case 1:
                    //查看
                    System.out.println("查看操作");
                    ws.run();
                    break;
                case 2:
                    //删除
                    System.out.println("删除操作");
                    System.out.print("请输入要删除的书号:");
                    wd.run(id = input.nextInt());
                    break;
                case 3:
                    System.out.println("模糊查找");
                    System.out.print("请输入要查找的书号:");
                    wf.run(id = input.nextInt());
                    break;
                default:
                    System.out.println("输入错误！");
                    break;
            }
            System.out.println("是否继续使用（y/n）");
            if(input.next().toUpperCase().equals("Y") != true) {
                break;
            }
        }while(true);
        System.out.println("正在退出系统 谢谢使用！");
    }
}
