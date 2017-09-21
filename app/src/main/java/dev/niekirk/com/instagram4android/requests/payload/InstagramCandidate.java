package dev.niekirk.com.instagram4android.requests.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by root on 21/09/17.
 */

@Getter
@Setter
@ToString(callSuper = true)
public class InstagramCandidate {

    public String url;
    public int width;
    public int height;

}