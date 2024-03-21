// Define a function to perform max operation
fn max(seq: &[i32], i: usize, j: usize) -> usize {
    // Compare elements at indices i and j, return the index of the maximum
    if seq[i] >= seq[j] {
        i
    } else {
        j
    }
}

// Define a function to perform reverse operation
fn reverse(seq: &mut [i32], i: usize) {
    let mut start = 0;
    let mut end = i;
    // Swap elements from the start and end of the prefix until they meet in the middle
    while start < end {
        seq.swap(start, end);
        start += 1;
        end -= 1;
    }
}

// Define the sorting algorithm
fn reverse_sort(seq: &mut [i32]) {
    // Iterate over the sequence backwards, ignoring the last element
    for i in (1..seq.len()).rev() {
        // Find the index of the maximum element within the current prefix
        let max_index = (0..=i).fold(0, |max_index, j| { max(seq, max_index, j) });
        // If the maximum is not at the end of the prefix, reverse the prefix up to the maximum and the entire prefix
        if max_index != i {
            reverse(seq, max_index);
            reverse(seq, i);
        }
    }
}

// use cargo run
fn main() {
    let mut discs = vec![4, 2, 1, 3];
    println!("Original sequence: {:?}", discs);

    reverse_sort(&mut discs);

    println!("Sorted sequence: {:?}", discs);
}

// use cargo test
#[cfg(test)]
mod tests {
    use super::*;
    use rand::{ Rng, thread_rng };
    use std::time::{ Instant };

    #[test]
    fn test_max() {
        assert_eq!(max(&[3, 2, 1], 0, 1), 0);
        assert_eq!(max(&[3, 2, 1], 1, 2), 1);
        assert_eq!(max(&[3, 2, 1], 0, 2), 0);
    }

    #[test]
    fn test_reverse() {
        let mut seq = vec![1, 2, 3, 4];
        reverse(&mut seq, 2);
        assert_eq!(seq, vec![3, 2, 1, 4]);
    }

    #[test]
    fn test_reverse_sort() {
        let mut seq = vec![4, 2, 1, 3];
        reverse_sort(&mut seq);
        assert_eq!(seq, vec![1, 2, 3, 4]);
    }

    #[test]
    fn performance_test_reverse_sort() {
        let mut rng = thread_rng();
        let mut seq: Vec<i32> = (0..1000).map(|_| rng.gen_range(0..1000)).collect();

        let start_time = Instant::now();
        reverse_sort(&mut seq);
        let duration = start_time.elapsed();

        println!("Time elapsed for sorting 1000 elements: {:?}", duration);
    }
}
