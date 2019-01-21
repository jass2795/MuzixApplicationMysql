package com.stackroute.MuzixApplication1.domain;

import io.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "Tracks")
public class Track
{

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated track Id")
    private  int id;
    @ApiModelProperty(notes = "Name of track")
    private String name;
    @ApiModelProperty(notes = "Comment of track")
    private String comment;

//private int id;
//private String name;
//private String comment;

}
