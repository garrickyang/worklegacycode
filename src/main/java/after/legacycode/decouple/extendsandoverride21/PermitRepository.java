package after.legacycode.decouple.extendsandoverride21;

public class PermitRepository {
    private volatile static PermitRepository singleInstance;

    private PermitRepository() {
    }

    public static PermitRepository getInstance() {
        if (singleInstance == null) {
            synchronized (PermitRepository.class) {
                if (singleInstance == null) {
                    singleInstance = new PermitRepository();
                }
            }
        }
        return singleInstance;
    }

    public Permit findAssociatedFromOrigination(OriginationPermit permit) {
        return new Permit();
    }
}
