---
title: "Deployments in the Windows Update for Business deployment service"
description: "**TODO: Add Description**"
author: "aarononeal"
localization_priority: Normal
ms.prod: "w10"
doc_type: conceptualPageType
---

# Deployments in the Windows Update for Business deployment service

Deployments are the foundation of the Windows Update for Business deployment service. Through a deployment you can target a set of devices to receive a specific content offer such as a [software update](windowsupdates-software-updates.md).

Deployments have the following key aspects:

1. Content: The content discovered in the catalog to deploy.
2. Audience: The devices to receive content.
3. Settings: Settings governing the rollout of content to devices and other configuration.
4. State: The current state of the deployment within its lifecycle.

## Create a deployment

Because content and audience are key to the definition of a deployment, both are required to be assigned at the time of creation. That assignment cannot be changed later, however, device membership within an audience can.

To learn more about creating a deployment, see [Deploy an update using the Windows Update for Business deployment service](windowsupdates-deploy-update.md).

## Configure settings

### Rollout

Rollout settings govern how the content is rolled out or offered. This provides control over whether all devices receive offers at the same time, gradually in sets, or beginning on a particular date and time.

To learn more, see [Schedule a deployment using the Windows Update for Business deployment service](windowsupdates-schedule-deployment.md).

### Monitoring

You can use monitoring settings to configure alerts and automated actions to take based on deployment signals.

To learn more, see [Manage monitoring rules for a deployment using the Windows Update for Business deployment service](windowsupdates-manage-monitoring-rules.md).

## Get or set lifecycle state

### States

Deployments move through the following lifecycle states.

| Value     | Description                                                                                                           |
|-----------|-----------------------------------------------------------------------------------------------------------------------|
| scheduled | Waiting for offer conditions to be met to start or continue offering the deployment.                                  |
| offering  | The deployment is offering updates to devices.                                                                        |
| paused    | The deployment is paused and prevented from offering updates to devices until an admin or monitoring rule resumes it. |


### Transitions

| Transition                     | Condition                                |
|--------------------------------|------------------------------------------|
| scheduled → offering           | Scheduled condition is met               |
| offering → scheduled           | Scheduled condition is not met           |
| scheduled or offering → paused | Admin request or monitoring rule paused  |
| paused → scheduled or offering | Admin request or monitoring rule resumed |

### Resource model

The [deployment](/graph/api/resources/windowsupdates-deployment?view=graph-rest-1.0) resource has a `state` property of type [deploymentState](/graph/api/resources/windowsupdates-deploymentstate?view=graph-rest-1.0) which provides information about the current lifecycle state.

The service will determine the effective `value` of the deployment state as a net result of several asynchronous processes, but you can request a particular value by setting `requestedValue`.

| Property       | Type                                                                                                              | Description                                                                                               |
|:---------------|:------------------------------------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------------------|
| value          | deploymentStateValue                                                                                              | Specifies the state of the deployment. Read-only. Possible values are: `scheduled`, `offering`, `paused`. |
| reasons        | [deploymentStateReason](/graph/api/resources/windowsupdates-deploymentstatereason?view=graph-rest-1.0) collection | Specifies the reasons the deployment has its state value. Read-only.                                      |
| requestedValue | requestedDeploymentStateValue                                                                                     | Specifies the requested state of the deployment. Possible values are: `none`, `paused`.                   |

## Multiple deployments

A device can be assigned to multiple deployments at one time. These deployments can be for content of different update categories, as well as for content of the same update category.

When a device is assigned to two deployments for content of different update categories (for example, a feature update and an expedited quality update), the deployment service will offer content in a sequence according to Microsoft’s recommendation.

When a device is assigned to two deployments for content of the same update category (for example, feature update versions 20H1 and 20H2, or quality updates from March 2021 and April 2021), the deployment service will offer the content that is highest ranked by Microsoft. For feature updates and quality updates, an update that was released more recently is higher ranked. This behavior does not apply if one of the deployments is still scheduled for the device and is not ready to offer content. In that case, the other deployment’s content will be delivered to the device.
