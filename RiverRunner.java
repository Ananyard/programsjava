class RiverRunner {
    public static void main(String[] args) {
        String name = River.getName();
        System.out.println("River name: " + name);
        String origin = River.getOrigin();
        System.out.println("River origin: " + origin);
        int length = River.getLengthKm();
        System.out.println("River length in km: " + length);
        boolean sacred = River.getIsSacred();
        System.out.println("Is river sacred? " + sacred);
        String country = River.getFlowsThrough();
        System.out.println("Flows through: " + country);
        double depth = River.getAverageDepth();
        System.out.println("Average depth: " + depth + " meters");
    }
}