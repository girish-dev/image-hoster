package ImageHoster.controller;

import ImageHoster.model.Comment;
import ImageHoster.service.CommentService;
import ImageHoster.service.ImageService;
import ImageHoster.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CommentController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private TagService tagService;

    @Autowired
    private CommentService commentService;

    @RequestMapping("/image/{imageId}/{imageTitle}/comments")
    public String createComment( @RequestParam("comments") String comments){

       Comment comment =  new Comment(comments);

       commentService.createComment(comment);

        return "/image/{imageId}/{imageTitle}/comments";
    }

}
