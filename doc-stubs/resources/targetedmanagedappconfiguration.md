---
title: "targetedManagedAppConfiguration resource type"
description: "Configuration used to deliver a set of custom settings as-is to all users in the targeted security group"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# targetedManagedAppConfiguration resource type

Namespace: microsoft.graph



Configuration used to deliver a set of custom settings as-is to all users in the targeted security group


Inherits from [managedAppConfiguration](../resources/managedappconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List targetedManagedAppConfigurations](../api/targetedmanagedappconfiguration-list.md)|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) collection|Get a list of the [targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) objects and their properties.|
|[Create targetedManagedAppConfiguration](../api/targetedmanagedappconfiguration-create.md)|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md)|Create a new [targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) object.|
|[Get targetedManagedAppConfiguration](../api/targetedmanagedappconfiguration-get.md)|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md)|Read the properties and relationships of a [targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) object.|
|[Update targetedManagedAppConfiguration](../api/targetedmanagedappconfiguration-update.md)|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md)|Update the properties of a [targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) object.|
|[Delete targetedManagedAppConfiguration](../api/targetedmanagedappconfiguration-delete.md)|None|Deletes a [targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) object.|
|[hasPayloadLinks](../api/targetedmanagedappconfiguration-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the policy was created. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|customSettings|[keyValuePair](../resources/keyvaluepair.md) collection|A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned by this service Inherited from [managedAppConfiguration](../resources/managedappconfiguration.md)|
|deployedAppCount|Int32|Count of apps to which the current policy is deployed.|
|description|String|The policy's description. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|displayName|String|Policy display name. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAssigned|Boolean|Indicates if the policy is deployed to any inclusion groups or not.|
|lastModifiedDateTime|DateTimeOffset|Last time the policy was modified. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|version|String|Version of the entity. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|apps|[managedMobileApp](../resources/managedmobileapp.md) collection|List of apps to which the policy is deployed.|
|assignments|[targetedManagedAppPolicyAssignment](../resources/targetedmanagedapppolicyassignment.md) collection|Navigation property to list of inclusion and exclusion groups to which the policy is deployed.|
|deploymentSummary|[managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md)|Navigation property to deployment summary of the configuration.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.targetedManagedAppConfiguration",
  "baseType": "microsoft.graph.managedAppConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.targetedManagedAppConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String",
  "customSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "deployedAppCount": "Integer",
  "isAssigned": "Boolean"
}
```

