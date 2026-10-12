import java.util.Scanner;

public class mobilePhone {
    private final String model;
    private final int memory;
    private final int cpuCore;

    // Constructor: runs once, when each phone is created
    public mobilePhone (String model, int memory, int cpuCore) {
        this.model = model;      // 'this.model' = the field, 'model' = the parameter
        this.memory = memory;
        this.cpuCore = cpuCore;
    }

    // Optional: a default phone, reusing the constructor above
    public mobilePhone () {
        this("AXTR", 16, 4);
    }

    public String getModel()  { return model; }
    public int getMemory()    { return memory; }
    public int getCpuCore()   { return cpuCore; }

    public void makeCall()    { System.out.println(model + " is making a call"); }
    public void takeCall()    { System.out.println(model + " is taking a call"); }
    public void sendMessage() { System.out.println(model + " is sending a message"); }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the model: ");
        String model = scanner.nextLine();

        System.out.print("Enter memory (GB): ");
        int memory = scanner.nextInt();

        System.out.print("Enter CPU cores: ");
        int cores = scanner.nextInt();

        mobilePhone  myPhone = new mobilePhone (model, memory, cores);   // user's phone
        mobilePhone  basic   = new mobilePhone ();                        // default AXTR

        System.out.println(myPhone.getModel() + ": " + myPhone.getMemory()
                + " GB, " + myPhone.getCpuCore() + " cores");
        myPhone.makeCall();
        basic.sendMessage();

        scanner.close();
    }
}