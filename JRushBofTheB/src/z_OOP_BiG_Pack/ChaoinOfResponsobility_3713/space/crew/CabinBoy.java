package z_OOP_BiG_Pack.ChaoinOfResponsobility_3713.space.crew;

public class CabinBoy extends AbstractCrewMember {
    public CabinBoy(AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println("Even the cabin boy can handle the request " + request);
    }
}
