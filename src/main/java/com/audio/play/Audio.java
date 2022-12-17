package com.audio.play;

import cn.hutool.core.io.resource.ResourceUtil;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.InputStream;
import java.util.concurrent.*;

/**
 * @author 孙骁
 * @date 2022-12-14
 */
public class Audio {
    ExecutorService service = new ThreadPoolExecutor(
            2,
            5,
            3,
            TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(3),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy()
    );
    private Player player;

    public Audio(String path) {
        InputStream is = ResourceUtil.getStream(path);
        try {
            player = new Player(is);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        service.submit(() -> {
            try {
                player.play();
            } catch (JavaLayerException ignored) {

            }
        });

    }
}
