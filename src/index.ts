import { registerPlugin } from '@capacitor/core';

import type { AndroidPostNotificationsPermissionPlugin } from './definitions';

const AndroidPostNotificationsPermission = registerPlugin<AndroidPostNotificationsPermissionPlugin>('AndroidPostNotificationsPermission', {});

export * from './definitions';
export { AndroidPostNotificationsPermission };
