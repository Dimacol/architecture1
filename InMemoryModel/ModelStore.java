

import java.util.ArrayList;
import java.util.List;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;


public class ModelStore implements  IModelChanger { 

    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangerObserver> changeObservers; 

    public ModelStore(List<IModelChangerObserver> changerObservers, List<PoligonalModel> models, List<Scene> scene, List<Flash> Flashes, List<Camera> Cameras) throws Exception {
       
        this.changeObservers = changeObservers;
        Models = new ArrayList<>(null);
        Scenes = new ArrayList<>(null);
        Flashes = new ArrayList<>(null) ;
        Cameras = new ArrayList<>(null);
      
        }

    public void NotifyChange(IModelChanger sender) {
    }

    public Scene getScena(int id) {
        return Scenes.get(id);
    
}

    @Override
    public void NotifyChange() {
        // TODO Auto-generated method stub
        
    }
}