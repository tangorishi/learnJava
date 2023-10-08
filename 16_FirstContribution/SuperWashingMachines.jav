public class WashingMachine {
    public static int minMovesToBalance(int[] machines) {
        int totalDresses = 0;
        int numMachines = machines.length;

        for (int i = 0; i < numMachines; i++) {
            totalDresses += machines[i];
        }

        if (totalDresses % numMachines != 0) {
            return -1;
        }

        int targetDresses = totalDresses / numMachines;
        int maxBalance = 0;
        int runningBalance = 0;

        for (int i = 0; i < numMachines; i++) {
            int balance = machines[i] - targetDresses;
            runningBalance += balance;
            maxBalance = Math.max(maxBalance, Math.abs(runningBalance));
        }

        return maxBalance;
    }

    public static void main(String[] args) {
        int[] machines1 = {1, 0, 5};
        int result1 = minMovesToBalance(machines1);
        System.out.println(result1); 
    }
}
