package kyu7;

import kyu7.LikesVsDislikes.Button;
import org.junit.jupiter.api.Test;
import static kyu7.LikesVsDislikes.Button.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LikesVsDislikesTest {

    @Test
    public void sampleTest() {
	assertEquals(Like, LikesVsDislikes.likeOrDislike(new Button[] { Like }), "For buttons [Like]");
	assertEquals(Nothing, LikesVsDislikes.likeOrDislike(new Button[] { Like, Like }), "For buttons [Like, Like]");
	assertEquals(Dislike, LikesVsDislikes.likeOrDislike(new Button[] { Like, Dislike }), "For buttons [Like, Dislike]");
	assertEquals(Nothing, LikesVsDislikes.likeOrDislike(new Button[] { Like, Dislike, Dislike }), "For buttons [Like, Dislike, Dislike]");
	assertEquals(Nothing, LikesVsDislikes.likeOrDislike(new Button[0]), "For no buttons");
	assertEquals(Like, LikesVsDislikes.likeOrDislike(new Button[] { Like, Like, Dislike, Dislike, Like, Like, Dislike, Like }), "For buttons [Like, Like, Dislike, Dislike, Like, Like, Dislike, Like]");
    }

}
