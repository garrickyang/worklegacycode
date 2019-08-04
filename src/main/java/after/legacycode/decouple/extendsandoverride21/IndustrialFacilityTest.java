package after.legacycode.decouple.extendsandoverride21;

import org.junit.Test;

public class IndustrialFacilityTest {
}

class MockIndustrialFacility extends IndustrialFacility {

    public MockIndustrialFacility(int facilityCode, String Owner, OriginationPermit permit) throws PermitViolatioinException {
        super(facilityCode, Owner, permit);
    }

    @Override
    protected Permit getAssociatedFromOrigination(OriginationPermit permit) {
        return new Permit();
    }

    @Test
    public void testFucntion() throws PermitViolatioinException {
        IndustrialFacility mockIndustrialFacility = new MockIndustrialFacility(1, "owner", new OriginationPermit());
        //test
        //assert
    }
}
