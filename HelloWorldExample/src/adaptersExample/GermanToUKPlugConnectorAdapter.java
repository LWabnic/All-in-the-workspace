package adaptersExample;

public class GermanToUKPlugConnectorAdapter implements UkPlugConnector {

    private GermanPlugConnector plug;

    public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }

}
