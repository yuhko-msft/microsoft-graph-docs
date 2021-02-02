---
title: "windowsDefenderApplicationControlPolicySigningCertificate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsDefenderApplicationControlPolicySigningCertificate resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsDefenderApplicationControlPolicySigningCertificates](../api/intune-windowsdefenderapplicationcontrolpolicysigningcertificate-list.md)|[windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md) collection|Get a list of the [windowsDefenderApplicationControlPolicySigningCertificate](../resources/windowsdefenderapplicationcontrolpolicysigningcertificate.md) objects and their properties.|
|[Create windowsDefenderApplicationControlPolicySigningCertificate](../api/intune-windowsdefenderapplicationcontrolpolicysigningcertificate-create.md)|[windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md)|Create a new [windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md) object.|
|[Get windowsDefenderApplicationControlPolicySigningCertificate](../api/intune-windowsdefenderapplicationcontrolpolicysigningcertificate-get.md)|[windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md)|Read the properties and relationships of a [windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md) object.|
|[Update windowsDefenderApplicationControlPolicySigningCertificate](../api/intune-windowsdefenderapplicationcontrolpolicysigningcertificate-update.md)|[windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md)|Update the properties of a [windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md) object.|
|[Delete windowsDefenderApplicationControlPolicySigningCertificate](../api/intune-windowsdefenderapplicationcontrolpolicysigningcertificate-delete.md)|None|Deletes a [windowsDefenderApplicationControlPolicySigningCertificate](../resources/intune-windowsdefenderapplicationcontrolpolicysigningcertificate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Binary|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|issuer|String|**TODO: Add Description**|
|issuerName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|
|subjectName|String|**TODO: Add Description**|
|validFromDateTime|DateTimeOffset|**TODO: Add Description**|
|validToDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsDefenderApplicationControlPolicySigningCertificate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsDefenderApplicationControlPolicySigningCertificate",
  "id": "String (identifier)",
  "displayName": "String",
  "content": "Binary",
  "description": "String",
  "subjectName": "String",
  "subject": "String",
  "issuerName": "String",
  "issuer": "String",
  "validToDateTime": "String (timestamp)",
  "validFromDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)"
}
```

