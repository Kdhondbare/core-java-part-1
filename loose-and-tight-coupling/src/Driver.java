public class Driver {
    public static void main(String[] args) {

        Machine machine = new Machine();//Tight coupling

        //Calling methods on machine refrence
        machine.powerOn();
        machine.reboot();
        machine.powerOff();

        IMachine iMachine = new Machine();//Loose coupling
        /*
        The above loosely coupled implementation prevents us from calling
        any method using iMachine that's specific to the Machine implementation.
        We are limited to only those methods defined in the IMachine interface.
        That means iMachine can access variable and methods of the IMachine interface
        only and not any additional method defined in the Machine class.
         */

        //Calling methods on iMachine reference
        iMachine.powerOn();
        /*
        iMachine reference does not have visibility of reboot() method.
        As it is not part of IMachine interface.
         */
       //iMachine.reboot();
        iMachine.powerOff();
    }
}
