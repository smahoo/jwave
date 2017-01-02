package de.smahoo.jwave.event;

public enum JWaveEventType {
	NONE,
	
	CNTRL_EVENT_INIT_STARTED,
	CNTRL_EVENT_INIT_COMPLETED,	
	CNTRL_EVENT_CONTROLLER_RESET,
	CNTRL_EVENT_ADD_NODE_TO_NETWORK_START,	
	CNTRL_EVENT_ADD_NODE_TO_NETWORK_SUCCESS,
	CNTRL_EVENT_SECURITY_INCLUDE_START,
	CNTRL_EVENT_SECURITY_INCLUDE_SUCCESS,
	CNTRL_EVENT_SECURITY_INCLUDE_FAILED,
	CNTRL_EVENT_ADD_NODE_TO_NETWORK_CANCELED,
	CNTRL_EVENT_ADD_NODE_TO_NETWORK_FAILED,
	CNTRL_EVENT_ADD_NODE_TO_NETWORK_EXPIRED,
	CNTRL_EVENT_REMOVE_NODE_FROM_NETWORK_START,
	CNTRL_EVENT_REMOVE_NODE_FROM_NETWORK_SUCCESS,
	CNTRL_EVENT_REMOVE_NODE_FROM_NETWORK_CANCELED,
	CNTRL_EVENT_REMOVE_NODE_FROM_NETWORK_FAILED,
	CNTRL_EVENT_REMOVE_NODE_FROM_NETWORK_EXPIRED,

		
	
	DATA_EVENT_DATAGRAM_RECEIVED,
	DATA_EVENT_DATAGRAM_TRANSMITTED, // accepted by controller
	DATA_EVENT_NODE_CMD_DELIVERED,	 // received by Node
	
	NODE_EVENT_NODE_ADDED,	
	NODE_EVENT_NODE_ALREADY_ADDED,
	NODE_EVENT_INTERVIEW_STARTED,
	NODE_EVENT_INTERVIEW_FINISHED,
	NODE_EVENT_INTERVIEW_ERROR,
	NODE_EVENT_INTERVIEW_CANCELED,
	NODE_EVENT_NODE_REMOVED,
	NODE_EVENT_DATA_RECEIVED,
	NODE_EVENT_DATA_SENT,	
	NODE_EVENT_DATA_NO_RESPONSE,
	NODE_EVENT_DATA_SEND_FAILED,
	NODE_EVENT_NIF_RECEIVED,
	
	NODE_EVENT_CONFIG_CHANGED,
	NODE_EVENT_CONFIG_DEVICE_TYPE_SET,
	NODE_EVENT_CONFIG_SECURITY_SET,
	NODE_EVENT_CONFIG_CAPABILITIES_SET,
	NODE_EVENT_CONFIG_CMD_CLASSES_SET,
	
	NODE_EVENT_SLEEP,
	NODE_EVENT_WAKEUP,
	NODE_EVENT_STATUS_CHANGED,	
	
	ERROR_UNKNOWN,
	ERROR_IO_CONNECTION,
	ERROR_CONTROLLER,
	ERROR_NODE_COMMUNICATION;
	
}
