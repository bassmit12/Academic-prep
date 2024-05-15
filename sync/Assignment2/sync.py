import threading

# Create semaphores
semaphore_A = threading.Semaphore(1)  # Start with semaphore A released
semaphore_B = threading.Semaphore(0)
semaphore_C = threading.Semaphore(0)
semaphore_D = threading.Semaphore(0)

def thread_A():
    semaphore_A.acquire()
    print(1)
    semaphore_B.release()
    semaphore_A.acquire()
    print(5)
    semaphore_B.release()

def thread_B():
    semaphore_B.acquire()
    print(2)
    semaphore_C.release()
    semaphore_B.acquire()
    print(6)
    semaphore_C.release()

def thread_C():
    semaphore_C.acquire()
    print(3)
    semaphore_D.release()
    semaphore_C.acquire()
    print(7)
    semaphore_D.release()

def thread_D():
    semaphore_D.acquire()
    print(4)
    semaphore_A.release()
    semaphore_D.acquire()
    print(8)
    semaphore_A.release()

# Create threads
thread_a = threading.Thread(target=thread_A)
thread_b = threading.Thread(target=thread_B)
thread_c = threading.Thread(target=thread_C)
thread_d = threading.Thread(target=thread_D)

# Start threads
thread_a.start()
thread_b.start()
thread_c.start()
thread_d.start()

# Wait for all threads to finish
thread_a.join()
thread_b.join()
thread_c.join()
thread_d.join()
