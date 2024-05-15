import threading
import time
import random

# Create semaphores
semaphore1 = threading.Semaphore(1)
semaphore2 = threading.Semaphore(1)
semaphore3 = threading.Semaphore(1)

def thread1():
    while True:
        semaphore1.acquire()
        print("Thread 1 acquired Semaphore 1")
        time.sleep(random.uniform(0.1, 0.5))  # Random sleep to simulate work and add irregularity in timing

        semaphore2.acquire()
        print("Thread 1 acquired Semaphore 2")
        # Simulate some work
        time.sleep(random.uniform(0.1, 0.5))

        # Release semaphores
        semaphore2.release()
        semaphore1.release()
        time.sleep(random.uniform(0.1, 0.5))

def thread2():
    while True:
        semaphore2.acquire()
        print("Thread 2 acquired Semaphore 2")
        time.sleep(random.uniform(0.1, 0.5))

        semaphore3.acquire()
        print("Thread 2 acquired Semaphore 3")
        # Simulate some work
        time.sleep(random.uniform(0.1, 0.5))

        # Release semaphores
        semaphore3.release()
        semaphore2.release()
        time.sleep(random.uniform(0.1, 0.5))

def thread3():
    while True:
        semaphore3.acquire()
        print("Thread 3 acquired Semaphore 3")
        time.sleep(random.uniform(0.1, 0.5))

        semaphore1.acquire()
        print("Thread 3 acquired Semaphore 1")
        # Simulate some work
        time.sleep(random.uniform(0.1, 0.5))

        # Release semaphores
        semaphore1.release()
        semaphore3.release()
        time.sleep(random.uniform(0.1, 0.5))

# Create threads
t1 = threading.Thread(target=thread1)
t2 = threading.Thread(target=thread2)
t3 = threading.Thread(target=thread3)

# Start threads
t1.start()
t2.start()
t3.start()
