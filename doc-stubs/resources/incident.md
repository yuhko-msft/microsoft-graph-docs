---
title: "incident resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# incident resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List incidents](../api/incident-list.md)|[incident](../resources/incident.md) collection|Get a list of the [incident](../resources/incident.md) objects and their properties.|
|[Create incident](../api/incident-create.md)|[incident](../resources/incident.md)|Create a new [incident](../resources/incident.md) object.|
|[Get incident](../api/incident-get.md)|[incident](../resources/incident.md)|Read the properties and relationships of an [incident](../resources/incident.md) object.|
|[Update incident](../api/incident-update.md)|[incident](../resources/incident.md)|Update the properties of an [incident](../resources/incident.md) object.|
|[Delete incident](../api/incident-delete.md)|None|Deletes an [incident](../resources/incident.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedTo|String|**TODO: Add Description**|
|classification|m365AlertClassification|**TODO: Add Description**. Possible values are: `unknown`, `falsePositive`, `truePositive`, `benignPositive`, `unknownFutureValue`.|
|comments|[m365AlertComment](../resources/m365alertcomment.md) collection|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|determination|m365AlertDetermination|**TODO: Add Description**. Possible values are: `unknown`, `apt`, `malware`, `securityPersonnel`, `securityTesting`, `unwantedSoftware`, `other`, `multiStagedAttack`, `compromisedUser`, `phishing`, `maliciousUserActivity`, `clean`, `insufficientData`, `confirmedUserActivity`, `lineOfBusinessApplication`, `unknownFutureValue`.|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|incidentWebUrl|String|**TODO: Add Description**|
|lastUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|redirectIncidentId|String|**TODO: Add Description**|
|severity|m365AlertSeverity|**TODO: Add Description**. Possible values are: `unknown`, `informational`, `low`, `medium`, `high`, `unknownFutureValue`.|
|status|incidentStatus|**TODO: Add Description**. Possible values are: `active`, `resolved`, `redirected`, `unknownFutureValue`.|
|tags|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.incident",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.incident",
  "id": "String (identifier)",
  "incidentWebUrl": "String",
  "redirectIncidentId": "String",
  "displayName": "String",
  "createdDateTime": "String (timestamp)",
  "lastUpdateDateTime": "String (timestamp)",
  "assignedTo": "String",
  "classification": "String",
  "determination": "String",
  "status": "String",
  "severity": "String",
  "tags": [
    "String"
  ],
  "comments": [
    {
      "@odata.type": "microsoft.graph.m365AlertComment"
    }
  ]
}
```

