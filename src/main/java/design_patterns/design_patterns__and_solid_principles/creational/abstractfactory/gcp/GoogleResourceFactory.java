package design_patterns.design_patterns__and_solid_principles.creational.abstractfactory.gcp;


import design_patterns.design_patterns__and_solid_principles.creational.abstractfactory.Instance;
import design_patterns.design_patterns__and_solid_principles.creational.abstractfactory.ResourceFactory;
import design_patterns.design_patterns__and_solid_principles.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int minMib) {
        return new GoogleCloudStorage(minMib);
    }
}
