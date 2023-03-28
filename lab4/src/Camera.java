import java.util.HashMap;

public class Camera {

    private HashMap<String, Boolean> utilitati;
    private TipCamera tipCamera;

    public Camera(HashMap<String, Boolean> utilitati, TipCamera tipCamera) {
        this.utilitati = utilitati;
        this.tipCamera = tipCamera;
    }

    public HashMap<String, Boolean> getUtilitati() {
        return utilitati;
    }

    public TipCamera getTipCamera() {
        return tipCamera;
    }

    public void setUtilitati(HashMap<String, Boolean> utilitati) {
        this.utilitati = utilitati;
    }

    public void setTipCamera(TipCamera tipCamera) {
        this.tipCamera = tipCamera;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "utilitati=" + utilitati +
                ", tipCamera=" + tipCamera +
                '}';
    }
}
