//LEVEL: kyu 5
//link: https://www.codewars.com/kata/515bb423de843ea99400000a/train/java

/*DESCRIPTION
For this exercise you will be strengthening your page-fu mastery.
You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.

The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page.
The types of values contained within the collection/array are not relevant.

The following are some examples of how this class is used:

PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
helper.pageCount(); //should == 2
helper.itemCount(); //should == 6
helper.pageItemCount(0); //should == 4
helper.pageItemCount(1); // last page - should == 2
helper.pageItemCount(2); // should == -1 since the page is invalid

// pageIndex takes an item index and returns the page that it belongs on
helper.pageIndex(5); //should == 1 (zero based index)
helper.pageIndex(2); //should == 0
helper.pageIndex(20); //should == -1
helper.pageIndex(-10); //should == -1
* */

package kyu5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I> {
    List<I> collection;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        this.collection = collection;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil(collection.size()/(double) itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int pagesAux = pageCount()-1;
        if(collection.isEmpty() || pageIndex < 0 || pageIndex > pagesAux){
            return -1;
        }

        if(pageIndex < pagesAux){
            return itemsPerPage;
        }

        return itemsPerPage - ((pageCount()*itemsPerPage) - collection.size());
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {

        if (collection.isEmpty() || itemIndex < 0 || itemIndex >= collection.size()) return -1;

        return (itemIndex/itemsPerPage);
    }
}

class PaginationHelperTest {
    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    PaginationHelper<Character> helperEmpty = new PaginationHelper(Arrays.asList(), 4);

    @Test
    public void pageCount() {
        Assertions.assertEquals(2, helper.pageCount());
    }

    @Test
    public void itemCount() {
        Assertions.assertEquals(6, helper.itemCount());
    }

    @Test
    public void pageItemCount() {
        Assertions.assertEquals(4, helper.pageItemCount(0));
        Assertions.assertEquals(2, helper.pageItemCount(1));
        Assertions.assertEquals(-1, helper.pageItemCount(2));
    }

    @Test
    public void pageIndex() {
        Assertions.assertEquals(1, helper.pageIndex(5));
        Assertions.assertEquals(0, helper.pageIndex(2));
        Assertions.assertEquals(-1, helper.pageIndex(20));
        Assertions.assertEquals(-1, helper.pageIndex(-5));
    }

    @Test
    public void pageItemCountEmptyCollection() {
        Assertions.assertEquals(-1, helperEmpty.pageItemCount(0));
    }

    @Test
    public void pageIndexEmptyCollection() {
        Assertions.assertEquals(-1, helperEmpty.pageIndex(5));
    }

}
