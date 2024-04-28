/*
Thread class methods

constructors
------------
Thread() basic constructor
Thread(Runnable r) we are passing class which is implementing Runnable interface.
Thread(Runnable r, String name) we can also mention the name of the thread
Thread(ThreadGroup g, String name)
Thread(String name) Just the thread name.


get()/set()
-----------
long getId() gets the thread ID
String getname() gets the name
int getPriority() gets the priority
Thread.state getState()  get the state(new, running, blocked....)
ThreadGroup getThreadGroup()

void setName(String name)
void setPriority(int P)
void setDaemon(boolean b) // A Daemon thread is a background thread with the least priority.(garbage collector)

Enquiry
-------
boolean isAlive()
boolean isDaemon()
boolean isInterrupted() // we can interrupt a thread. we use this to see if the thread is interrupted.


Instance methods
----------------
void interrupt() interrupts the thread
void join() A thread finish its job, it can wait for other threads to complete using this method.
void join(long millis) It can join for some time(milliseconds)
void run() runs the thread
void start() starts the thread

static methods
--------------
int activeCount() gives the active thread count
Thread currentThread() gets the reference of the current thread
void yield() A thread which is currently running can yield and give a chance to other threads.
void dumpStack() gives the stack of an application which method called which method similar to exception handling getStack


 */
public class ThreadClass {
}
