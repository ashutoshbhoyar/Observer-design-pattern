# Observer-design-pattern

**Observer Design Pattern in Java**

**Overview**

The Observer design pattern is a software design pattern that allows objects to be notified of changes in the state of other objects. It is a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Implementation**

The Observer design pattern is implemented using two interfaces:

* **Subject:** This interface defines the methods for attaching and detaching observers, and for notifying them of changes in state.
* **Observer:** This interface defines the method that is called when an observer is notified of a change in state.

**Example**

The following example shows a simple implementation of the Observer design pattern in Java:

```java
public interface Subject {
  void subscribe(Observer ob);
  void unsubscribe(Observer ob);
  void notifyObservers();
}

public interface Observer {
  void update();
}

public class ConcreteSubject implements Subject {
  private List<Observer> observers = new ArrayList<>();

  @Override
  public void subscribe(Observer ob) {
    observers.add(ob);
  }

  @Override
  public void unsubscribe(Observer ob) {
    observers.remove(ob);
  }

  @Override
  public void notifyObservers() {
    for (Observer ob : observers) {
      ob.update();
    }
  }

  // ... other methods ...
}

public class ConcreteObserver implements Observer {
  private Subject subject;

  public ConcreteObserver(Subject subject) {
    this.subject = subject;
    subject.subscribe(this);
  }

  @Override
  public void update() {
    // ... do something when the subject changes state ...
  }
}

public class Demo {
  public static void main(String[] args) {
    Subject subject = new ConcreteSubject();

    Observer observer1 = new ConcreteObserver(subject);
    Observer observer2 = new ConcreteObserver(subject);

    // ... do something to change the state of the subject ...

    subject.notifyObservers();
  }
}
```

In this example, the `ConcreteSubject` class implements the `Subject` interface. It maintains a list of observers and provides methods for attaching and detaching observers, and for notifying them of changes in state.

The `ConcreteObserver` class implements the `Observer` interface. It has a reference to the subject that it is observing and provides a method that is called when the subject changes state.

The `Demo` class creates a concrete subject and two concrete observers. It then changes the state of the subject and notifies the observers.

**Usage**

The Observer design pattern can be used in a variety of situations, such as:

* GUI applications: To update the display when the state of the underlying data changes.
* Asynchronous programming: To notify multiple threads when a task is completed.
* Distributed systems: To notify multiple components when a change occurs in one component.

**Benefits**

The Observer design pattern offers a number of benefits, including:

* Loose coupling: Observers are not tightly coupled to the subject. They can be attached and detached from the subject without affecting the subject's code.
* Reusability: Observers can be reused with different subjects.
* Scalability: The Observer design pattern is easily scalable. New observers can be added to the subject without affecting the performance of the system.

**Conclusion**

The Observer design pattern is a powerful and flexible design pattern that can be used in a variety of situations. It is a good choice for applications where objects need to be notified of changes in the state of other objects.
