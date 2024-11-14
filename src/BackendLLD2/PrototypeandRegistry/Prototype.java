package BackendLLD2.PrototypeandRegistry;

// we have defined an interface
// Any class who wants to showcase that it has the copying functionality
// can implement this class
public interface Prototype<T> {
    T copy();
}
