package com.social.blog.note.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.social.blog.note.model.Note;
import com.social.blog.repository.NoteRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/api")
public class NoteController {

	@Autowired
	NoteRepository noteRepository;

	@ApiOperation(value = "Create a Note")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/notes", method = RequestMethod.POST, produces = "application/json")
	/*@PostMapping("/notes")*/
	public Note createNote(@Valid @RequestBody Note note) {
		return noteRepository.save(note);
	}

	@ApiOperation(value = "Get a Note")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/notes", method = RequestMethod.GET, produces = "application/json")
  //@GetMapping("/notes")
	public List<Note> getAllNotes() {
		return noteRepository.findAll();
	}

}
