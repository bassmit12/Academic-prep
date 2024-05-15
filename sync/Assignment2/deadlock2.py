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
        time.sleep(random.uniform(0.2, 0.6))  # Work simulation

        semaphore2.acquire()
        print("Thread 1 acquired Semaphore 2")
        time.sleep(random.uniform(0.2, 0.6))

        semaphore2.release()
        semaphore1.release()
        time.sleep(random.uniform(0.1, 0.3))  # Less frequent activity

def thread2():
    while True:
        semaphore2.acquire()
        print("Thread 2 acquired Semaphore 2")
        time.sleep(random.uniform(0.2, 0.6))

        semaphore3.acquire()
        print("Thread 2 acquired Semaphore 3")
        time.sleep(random.uniform(0.2, 0.6))

        semaphore3.release()
        semaphore2.release()
        time.sleep(random.uniform(0.1, 0.3))

def thread3():
    while True:
        # Randomize the acquisition order in Thread 3
        if random.choice([True, False]):
            semaphore3.acquire()
            print("Thread 3 acquired Semaphore 3")
            time.sleep(random.uniform(0.2, 0.6))

            semaphore1.acquire()
            print("Thread 3 acquired Semaphore 1")
            time.sleep(random.uniform(0.2, 0.6))
        else:
            semaphore1.acquire()
            print("Thread 3 acquired Semaphore 1")
            time.sleep(random.uniform(0.2, 0.6))

            semaphore3.acquire()
            print("Thread 3 acquired Semaphore 3")
            time.sleep(random.uniform(0.2, 0.6))

        semaphore1.release()
        semaphore3.release()
        time.sleep(random.uniform(0.1, 0.3))

# Create threads
t1 = threading.Thread(target=thread1)
t2 = threading.Thread(target=thread2)
t3 = threading.Thread(target=thread3)

# Start threads
t1.start()
t2.start()
t3.start()
