package IP.uy.yulghun.test;

import org.junit.Assert;
import org.junit.Test;
import uy.yulghun.LinkedList;
import uy.yulghun.Node;

public class LinkedListTest {

    @Test
    public void prependNodeTest(){
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(1);

        Node node = linkedList.findNode(1);

        Assert.assertNotNull(node);
        Assert.assertEquals(1, node.getData());
    }
}
