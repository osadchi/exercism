package org.example;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class BinarySearch {
    List<Integer> list;

    BinarySearch(List<Integer> items) {
        list = new ArrayList<>(items);
        Collections.sort(list);
    }

    int indexOf(int item) throws ValueNotFoundException {
        int left = 0;
        int right = list.size() - 1;
        int mid;

        while (left <= right)
        {
            mid = (left + right) / 2;
            int el = list.get(mid);
            if (el == item)
            {
                return mid;
            }
            else if (el < item)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        throw new ValueNotFoundException("Value not in array");
    }
}
