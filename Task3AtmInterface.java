import java.util.Scanner;
public class Task3AtmInterface {
    Scanner scanner=new Scanner(System.in);
    private String name;
    private int initialBalance;
    public Task3AtmInterface(String name,int initialBalane ){
        this.initialBalance=initialBalane;
        this.name=name;
    }
    public void logIn(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1/log In");
        System.out.println("2/Exit");
        System.out.print("Choose an option : ");
        String password = "secret";
        String enteredPassword;
        int n=scanner.nextInt();
        scanner.nextLine();
        switch (n){
            case 1:
            System.out.print("Enter The Password:");
            while (true) {
                enteredPassword = scanner.nextLine();
                if (enteredPassword.equals(password)) {
                    System.out.println("Logged in");
                    break;
                } else {
                    System.out.println("Try Again:");
                }
            }
            break;

            case 2:System.out.println("Thank You");
            break;

            default:
                break;
        }
    }
    public String deposit(){
        int money;
        System.out.println("Enter the number of money you want to put : ");
        money=scanner.nextInt();
        initialBalance=initialBalance+money;
        return "Deposit Successful your balance is : "+initialBalance;
    }
    public String withdraw(){
        int money;
        System.out.println("Enter the number of money you want to take : " );
        money=scanner.nextInt();
        if(money>initialBalance){
            System.out.println("Error Completing This Opertation ");
        }
        initialBalance=initialBalance-money;
        return "Withdraw Successful your balance is : "+initialBalance;
    }
    public String checkBalance(){
        return "Your Balance is : "+initialBalance;
    }
    public void userInterface(){
        logIn();
        while (true) {
            System.out.println("1/Deposit");
            System.out.println("2/Withdraw");
            System.out.println("3/Check Balance");
            System.out.println("4/Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(deposit());
                    break;
                case 2:
                    System.out.println(withdraw());
                    break;
                case 3:
                    System.out.println(checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static void main(String[]args){
        Task3AtmInterface user = new Task3AtmInterface("Kateb", 2450);
        user.userInterface();
    }
        }



