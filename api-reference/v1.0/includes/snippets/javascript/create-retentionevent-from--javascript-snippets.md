---
description: "Automatically generated file. DO NOT MODIFY"
---

```javascript

const options = {
	authProvider,
};

const client = Client.init(options);

const retentionEvent = {
  '@odata.type': '#microsoft.graph.security.retentionEvent',
  displayName: 'String',
  description: 'String',
  eventQuery: [
    {
      '@odata.type': 'microsoft.graph.security.eventQuery'
    }
  ],
  eventTriggerDateTime: 'String (timestamp)',
  createdBy: {
    '@odata.type': 'microsoft.graph.identitySet'
  },
  eventPropagationResults: [
    {
      '@odata.type': 'microsoft.graph.security.eventPropagationResult'
    }
  ],
  eventStatus: {
    '@odata.type': 'microsoft.graph.security.retentionEventStatus'
  },
  lastStatusUpdateDateTime: 'String (timestamp)'
};

await client.api('/security/triggers/retentionEvents')
	.post(retentionEvent);

```