/* LiteOS Version 0.3 */
/*
The following is the license of LiteOS.

This file is part of LiteOS.
Copyright Qing Cao, 2007-2008, University of Illinois , qcao2@uiuc.edu

LiteOS is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

LiteOS is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with LiteOS.  If not, see <http://www.gnu.org/licenses/>.
*/

 


#ifndef FSSTRINGH
#define FSSTRINGH



/** \addtogroup filesystem */

/**@{*/
/** Extract the string. For example, /c/Temp extracts c first.  
      @param start the string to be extracted
      @param buffer the buffer to put the string
      @return the next string to be extracted in the original string 
*/

char* extractString(char* start, char *buffer);


/** Extract last file name in the path name parameter */

char* extractLastName(char *pathname);


int fileMode( char *s ); 

/**@}*/

#endif 

