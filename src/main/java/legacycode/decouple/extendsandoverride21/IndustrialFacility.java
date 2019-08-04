package legacycode.decouple.extendsandoverride21;

public class IndustrialFacility extends Facility {
    Permit basePermit;

    public IndustrialFacility(int facilityCode, String Owner, OriginationPermit permit) throws PermitViolatioinException {
        //what if we dont' want to connect repository since it is time consuming?
        Permit associatedPermit = PermitRepository.getInstance().findAssociatedFromOrigination(permit);
        if (associatedPermit.isValid() && !permit.isValid()) {
            basePermit = associatedPermit;
        } else if (!permit.isValid()) {
            permit.validate();
            basePermit = permit;
        } else {
            throw new PermitViolatioinException();
        }
    }

    @Override
    public boolean hasPermits() {
        return false;
    }
}
