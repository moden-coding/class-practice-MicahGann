public class App {
    public static void main(String[] args) throws Exception {
        phoneBattery phone1 = new phoneBattery(84);
        phone1.chargeBattery(16);
        System.out.println(phone1);
        if(phone1.isCharged()){
            System.out.println("The battery is charged");
        } else {
            System.out.println("The battery is not charged");
        }
        phone1.depleteBattery(14);
        System.out.println(phone1);
        if(phone1.isCharged()){
            System.out.println("The battery is charged");
        } else {
            System.out.println("The battery is not charged");
        }
    }
}
