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




package tools.terminal;

import java.util.ArrayList;

/**
 * The du command class that allows the current directory information to be displayed.
 */
public class formatCommand implements cmdcontrol {


    private byte[] reply = new byte[64];


    public int setNewCommand(String[] options, int optioncount, String [] parameters, int parametercount, fileDirectory fdir) {

        fileNode currentnode = fdir.getCurrentNode();
        int currentAddress = currentnode.getNodeAddress();
        int currentBlock = currentnode.getBlock();

        byte[] filename = parameters[0].getBytes();

        reply[0] = (byte) 3;
        reply[1] = (byte) 233;
        reply[2] = (new Integer(currentAddress)).byteValue();

        //System.arraycopy(filename, 0, reply, 3, filename.length);

        //reply[3+filename.length] = (byte)0;

        return 1;  //To change body of implemented methods use File | Settings | File Templates.
    }

    //Return the  delay in milliseconds
    public int getDelay() {
        return 200;  //To change body of implemented methods use File | Settings | File Templates.
    }

    //return the command will be used
    public byte[] getNewCommand(int index) {
        return reply;
    }


    public void handleresponse(String[] options, int optioncount, String [] parameters, int parametercount, ArrayList reply, fileDirectory fdir) {


        return;
    }
}

