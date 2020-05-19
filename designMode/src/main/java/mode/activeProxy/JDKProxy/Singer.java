package mode.activeProxy.JDKProxy;

import mode.activeProxy.JDKProxy.ISinger;

/**
 *  目标对象实现了某一接口
 */
public class Singer implements ISinger {
    public void sing(){
        System.out.println("唱一首歌");
    }
}
