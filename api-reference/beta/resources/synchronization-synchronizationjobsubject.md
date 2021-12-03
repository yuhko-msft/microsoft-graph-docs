---
title: "synchronizationJobSubject resource type"
description: "Definition of the subject to be provisioned on demand."
author: "ArvindHarinder1"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# synchronizationJobSubject resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|links|[synchronizationLinkedObjects](../resources/synchronizationlinkedobjects.md)|Links to synchronize such as the manager of a user or a member of a group.|
|objectId|String|Identifier of the object in the source system. when provisioning a user from Azure AD into an application, this is the objectId of the user.|
|objectTypeName|String|Type of object being provisioned. Possible values are: `user` and `group`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.synchronizationJobSubject"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.synchronizationJobSubject",
  "objectId": "String",
  "objectTypeName": "String",
  "links": {
    "@odata.type": "microsoft.graph.synchronizationLinkedObjects"
  }
}
```