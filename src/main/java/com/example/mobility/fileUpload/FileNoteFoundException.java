package com.example.mobility.fileUpload;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FileNoteFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FileNoteFoundException(String message)
    {
        super(message);
    }

    public FileNoteFoundException(String message , Throwable cause)
    {
        super(message, cause);
    }

}

