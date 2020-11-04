---
title: "policy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# policy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List policies](../api/policy-list.md)|[policy](../resources/policy.md) collection|Get a list of the [policy](../resources/policy.md) objects and their properties.|
|[Create policy](../api/policy-create.md)|[policy](../resources/policy.md)|Create a new [policy](../resources/policy.md) object.|
|[Get policy](../api/policy-get.md)|[policy](../resources/policy.md)|Read the properties and relationships of a [policy](../resources/policy.md) object.|
|[Update policy](../api/policy-update.md)|[policy](../resources/policy.md)|Update the properties of a [policy](../resources/policy.md) object.|
|[Delete policy](../api/policy-delete.md)|None|Deletes a [policy](../resources/policy.md) object.|
|[checkMemberGroups](../api/policy-checkmembergroups.md)|String collection|**TODO: Add Description**|
|[checkMemberObjects](../api/policy-checkmemberobjects.md)|String collection|**TODO: Add Description**|
|[getMemberGroups](../api/policy-getmembergroups.md)|String collection|**TODO: Add Description**|
|[getMemberObjects](../api/policy-getmemberobjects.md)|String collection|**TODO: Add Description**|
|[restore](../api/policy-restore.md)|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|
|[List appliesTo](../api/policy-list-appliesto.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the appliesTo navigation property.|
|[Add appliesTo](../api/policy-post-appliesto.md)|[directoryObject](../resources/directoryobject.md)|Add appliesTo by posting to the appliesTo collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|alternativeIdentifier|String|**TODO: Add Description**|
|definition|String collection|**TODO: Add Description**|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|isOrganizationDefault|Boolean|**TODO: Add Description**|
|keyCredentials|[keyCredential](../resources/keycredential.md) collection|**TODO: Add Description**|
|type|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appliesTo|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policy",
  "baseType": "Microsoft.DirectoryServices.directoryObject",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.policy",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "alternativeIdentifier": "String",
  "definition": [
    "String"
  ],
  "displayName": "String",
  "isOrganizationDefault": "Boolean",
  "keyCredentials": [
    {
      "@odata.type": "microsoft.graph.keyCredential"
    }
  ],
  "type": "String"
}
```

