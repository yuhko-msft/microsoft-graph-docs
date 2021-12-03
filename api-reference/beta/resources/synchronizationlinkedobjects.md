---
title: "synchronizationLinkedObjects resource type"
description: "Definition of links (manager, owner, member) to be updated during on demand provisioning."
author: "ArvindHarinder1"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# synchronizationLinkedObjects resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|manager|[synchronizationJobSubject](../resources/synchronization-synchronizationjobsubject.md)|Manager of the user being synchronized.|
|members|[synchronizationJobSubject](../resources/synchronization-synchronizationjobsubject.md) collection|Member of the group being synchronized.|
|owners|[synchronizationJobSubject](../resources/synchronization-synchronizationjobsubject.md) collection|Owner of the group being synchronized.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.synchronizationLinkedObjects"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.synchronizationLinkedObjects",
  "manager": {
    "@odata.type": "microsoft.graph.synchronizationJobSubject"
  },
  "members": [
    {
      "@odata.type": "microsoft.graph.synchronizationJobSubject"
    }
  ],
  "owners": [
    {
      "@odata.type": "microsoft.graph.synchronizationJobSubject"
    }
  ]
}
```

