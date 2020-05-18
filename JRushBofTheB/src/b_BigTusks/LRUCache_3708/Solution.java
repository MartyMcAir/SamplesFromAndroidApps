package b_BigTusks.LRUCache_3708;

import b_BigTusks.LRUCache_3708.retrievers.CachingProxyRetriever;
import b_BigTusks.LRUCache_3708.retrievers.OriginalRetriever;
import b_BigTusks.LRUCache_3708.retrievers.Retriever;
import b_BigTusks.LRUCache_3708.storage.RemoteStorage;
import b_BigTusks.LRUCache_3708.storage.Storage;

/* 
Кеширующий Proxy
*/
// https://javarush.ru/tasks/com.javarush.task.task37.task3708#discussion
public class Solution {
    private static final int n = 10;

    public static void main(String[] args) {
        Storage storage = new RemoteStorage();

        fillStorage(storage);

        System.out.println("Testing OriginalRetriever: ");
        testRetriever(new OriginalRetriever(storage)); // там sleep на 2сек внутри storage в методе get(..)

        System.out.println("-------------------Testing CachingProxyRetriever: ");
        testRetriever(new CachingProxyRetriever(storage));
    }

    private static void fillStorage(Storage storage) {
        for (int i = 0; i < n; i++) {
            storage.add("Resource #" + i);
        }
    }

    private static void testRetriever(Retriever retriever) {
        for (int i = 0; i < n * 4; i++) {
            System.out.println("Loaded value : " + retriever.retrieve((long) (Math.random() * n)));
        }
    }
}
